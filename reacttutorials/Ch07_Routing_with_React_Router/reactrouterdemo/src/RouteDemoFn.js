import React from 'react';
import { BrowserRouter, Link, Route, Routes  } from 'react-router-dom';
import Apple from './components/Apple';
import Mango from './components/Mango';
import Orange from './components/Orange';
const RouteDemoFn = () => {
    return (
        <div>
            Router Functional Component 
            <BrowserRouter>
        <nav>
          <ul>
            <li><Link to="/apple">Apple</Link></li>
            <li><Link to="/mango">Mango</Link></li>
            <li><Link to="/orange">Orange</Link></li>
          </ul>
        </nav>
        <Routes>
        <Route exact path="/apple" element={<Apple/>}/>
        <Route exact path="/mango" element={<Mango/>}/>
        <Route exact path="/orange" element={<Orange/>}/>
        </Routes>
        </BrowserRouter>
        </div>
    );
};
export default RouteDemoFn;