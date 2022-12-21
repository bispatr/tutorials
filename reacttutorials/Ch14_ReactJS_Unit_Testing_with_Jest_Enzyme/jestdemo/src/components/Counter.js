import React,{useState} from 'react';
const Counter=()=>{
    const [counter,setCounter]=useState(0);
    const incrementCounter=()=>{
        setCounter(counter+1);
    };
    return(
        <div>
            <p data-testid="counter">{counter}</p>
            <button data-testid="increment" onClick={incrementCounter}>+</button>
        </div>
    )
}
export default Counter;
