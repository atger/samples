import React from 'react';
import {StoreProvider} from './Contexts/Store';
import { Home } from './Screens/Home'
import { Signup } from './Screens/Signup';
import { LoginForm } from './Screens/LoginForm';
import { BrowserRouter as Router, Route } from "react-router-dom";

function App() {
  return (
    <StoreProvider>
        <Router>
            <Route exact path="/" component={LoginForm} />
            <Route exact path="/login" component={LoginForm} />
            <Route exact path="/home" component={Home} />
            <Route exact path="/signup" component={Signup} />
        </Router>
    </StoreProvider>
  );
}

export default App;
