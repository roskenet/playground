import React from 'react';
import { Routes, Route } from "react-router-dom";
import './App.less';
import About from "./About/About";
import Counter from "./Counter/Counter";
import Landing from "./Landing/Landing";

function App() {
  return (
      <div>
        <Routes>
          <Route path='/' element={<Landing/>}></Route>
          <Route path='/about' element={<About/>}></Route>
          <Route path='/counter' element={<Counter/>}></Route>
        </Routes>
      </div>
  )
}

export default App;
