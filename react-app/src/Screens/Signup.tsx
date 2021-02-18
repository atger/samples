import React, { useState, useContext, useEffect } from 'react'
import { useHistory } from 'react-router-dom';
import { getData } from '../localStorage/getData';
import { handleSignup } from '../api/handleSignup';
import logo  from '../logo.svg';
import { Store } from '../Contexts/Store';
import { Button, Form, Grid, Header, Image, Message, Segment } from 'semantic-ui-react'

const Signup = () => {
    const [username, setUsername] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const { setUser } = useContext(Store);
    const history = useHistory();
    const handleSubmit = async () => {
        const values = {"username": username, "email": email, "password": password}
        const res = await handleSignup(values);
        if (res) {
            if (res.data) {
                setUser(res.data);
                history.push("/login");
                console.log(res.data);
            }
        }

    }
    return (
        <Grid textAlign='center' style={{ height: '100vh' }} verticalAlign='middle'>
            <Grid.Column style={{ maxWidth: 450 }}>
                <Header as='h2' color='teal' textAlign='center'>
                    <Image src={logo} /> Sign Up To Silkworm Database
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
                        icon="mail"
                        iconPosition="left"
                        placeholder='Email'
                        onChange={(e) => setEmail(e.target.value)}
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
                            Signup
                        </Button>
                    </Segment>
                </Form>
                <Segment>
                    <Button fluid onClick={(e) => history.push("/login")}>
                        Back To Login
                    </Button>
                </Segment>
            </Grid.Column>
        </Grid>
    );
}

export { Signup }