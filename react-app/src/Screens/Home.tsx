import React, { useState, useContext, useEffect } from 'react'
import { useHistory } from 'react-router-dom';
import { getData } from '../localStorage/getData';
import { handleLogin } from '../api/handleLogin';
import logo  from '../logo.svg';
import { Store } from '../Contexts/Store';
import { TopMenu } from '../Components/TopMenu';
import { Button, Form, Input, Menu, Grid, Header, Image, Message, Segment } from 'semantic-ui-react'

const Home = () => {
    const [activeItem, setActivateItem] = useState('home');
    const history = useHistory();
    const logout = () => {
        localStorage.clear();
        history.push("/login");
    }
    return (
        <Segment>
            <TopMenu/>
            <Grid textAlign='center' style={{ height: '100vh' }} verticalAlign='middle'>
                <Grid.Column style={{ maxWidth: 450 }}>
                    <Header as='h2' color='teal' textAlign='center'>
                        <Image src={logo} /> Welcome To Silkworm Database
                    </Header>
                </Grid.Column>
            </Grid>
        </Segment>
    );
}

export { Home }