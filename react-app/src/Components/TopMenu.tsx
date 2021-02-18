import React, { useState, useContext, useEffect } from 'react'
import { useHistory } from 'react-router-dom';
import { Input, Menu } from 'semantic-ui-react'

const TopMenu = () => {
    const [activeItem, setActivateItem] = useState('home');
    const history = useHistory();
    const logout = (history:any) => {
        localStorage.clear();
        history.replace('/', 0);
    }
    return (
        <Menu pointing secondary>
            <Menu.Item
            name='home'
            active={activeItem === 'home'}
            onClick={() => setActivateItem('home')}
            />
            <Menu.Item
            name='blast'
            active={activeItem === 'blast'}
            onClick={() => setActivateItem('blast')}
            />
            <Menu.Item
            name='genes'
            active={activeItem === 'genes'}
            onClick={() => setActivateItem('genes') }
            />
            <Menu.Item
            name='proteins'
            active={activeItem === 'proteins'}
            onClick={() => setActivateItem('proteins') }
            />
            <Menu.Item
            name='gene features'
            active={activeItem === 'gene features'}
            onClick={() => setActivateItem('gene features')}
            />
            <Menu.Item
            name='annotations'
            active={activeItem === 'annotations'}
            onClick={() => setActivateItem('annotations')}
            />
            <Menu.Item
            name='pathways'
            active={activeItem === 'pathways'}
            onClick={() => setActivateItem('pathways')}
            />
            <Menu.Menu position='right'>
                <Menu.Item>
                    <Input icon='search' placeholder='Search...' />
                </Menu.Item>
                <Menu.Item
                name='logout'
                active={activeItem === 'logout'}
                onClick={() => logout(history)}
                />
            </Menu.Menu>
        </Menu>
    );
}

export { TopMenu }