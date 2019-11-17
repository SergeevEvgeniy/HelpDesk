import React from 'react';
import { Switch, Route, Link } from 'react-router-dom';
import Home from './components/Home';
import Desk from './components/Desk';

function App() {
  return (
    <div>
      <Link to={'/'} style={{ margin: 20 }}>Home</Link>
      <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/edit" exact component={Desk} />
      </Switch>
      
    </div>
  );

}

export default App;