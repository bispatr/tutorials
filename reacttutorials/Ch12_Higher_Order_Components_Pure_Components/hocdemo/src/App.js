import {useState} from 'react';
function App() {
  return (
    <div className="App">
      <h1>I am main component</h1>
      <HOCRED cmp={Counter} />
      <HOCGREEN cmp={Counter} />
      <HOCBLUE cmp={Counter} />
    </div>
  );
}
function HOCRED(props){
  return(
    <div style={{backgroundColor:'red',width:'100px'}}><props.cmp /></div>
  )
}
function HOCGREEN(props){
  return(
    <div style={{backgroundColor:'green',width:'100px'}}><props.cmp /></div>
  )
}
function HOCBLUE(props){
  return(
    <div style={{backgroundColor:'blue',width:'100px'}}><props.cmp /></div>
  )
}
export default App;
function Counter(){
  const [Count,setCount]=useState(0);
  return(
    <div>
      <h3>{Count}</h3>
      <button onClick={()=>setCount(Count+1)}>Increment</button>
    </div>
  )
}
