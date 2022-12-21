import React from 'react';
import { useState } from 'react';
const FuncComp = () => {
    const [name,setName]= useState('John Wright');
  const handleNameChange=(e)=>{
    setName(e.target.value);
  }
    return (
        <div>
            <h1>Functional Components</h1>
            <input type="text" value={name} onChange={handleNameChange}></input>
            <p>{name}</p>
            <input type="text" value={name} onChange={(event)=>setName(event.target
            .value)}></input>
        </div>
    );
};
export default FuncComp;