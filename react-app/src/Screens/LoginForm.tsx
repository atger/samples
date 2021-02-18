import React, { useState, useContext, useEffect } from 'react'
import { useHistory } from 'react-router-dom';
import { getData } from '../localStorage/getData';
import { handleLogin } from '../api/handleLogin';
import logo  from '../logo.png';
import { Store } from '../Contexts/Store';
import { Button, Form, Grid, Header, Image, Message, Segment } from 'semantic-ui-react'

const LoginForm = () => {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const { setUser } = useContext(Store);
    const history = useHistory();
    const handleSubmit = async () => {
        const values = {"username": username, "password": password}
        const res = await handleLogin(values);
        if (res) {
            if (res.data) {
                setUser(res.data);
                history.push("/home");
                console.log(res.data);
            }
        }

    }
    return (
        <Grid textAlign='center' style={{ height: '100vh' }} verticalAlign='middle'>
            <Grid.Column style={{ maxWidth: 450 }}>
                <Header as='h2' color='teal' textAlign='center'>
                    <Image src={logo} /> Log In To Silkworm Database
                </Header>
                <Form 
                size='large' 
                onSubmit={ (event) => handleSubmit() }
                >
                    <Segment stacked>
                        <Form.Input 
                        fluid 
                        icon='user' 
                        iconPosition='left' 
                        placeholder='Username'
                        onChange={(e) => setUsername(e.target.value)}
                        />
                        <Form.Input
                        fluid
                        icon='lock'
                        iconPosition='left'
                        placeholder='Password'
                        type='password'
                        onChange={e => setPassword(e.target.value)}
                        />
                        <Button 
                        color='teal' 
                        fluid 
                        size='large' 
                        type="submit" 
                        disabled={!username||!password}
                        >
                            Login
                        </Button>
                    </Segment>
                </Form>
                <Segment>
                    <Button fluid onClick={(e) => history.push("/signup")}>
                        Sign Up
                    </Button>
                </Segment>
            </Grid.Column>
        </Grid>
    );
}

export { LoginForm }