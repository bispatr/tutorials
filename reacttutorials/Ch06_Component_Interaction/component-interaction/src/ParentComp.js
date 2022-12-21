import React from 'react';
import ChildA from './ChildA';
import ChildB from './ChildB';
const ParentComp = () => {
    const [message, setMessage] = React.useState("Hello World");
  const chooseMessage = (message) => {
    setMessage(message);
  };
    return (
        <div>
            <h5>Parent Component</h5>
            <h1>{message}</h1>
            <ChildA chooseMessage={chooseMessage}/>
            <ChildB chooseMessage={chooseMessage}/>
        </div>
    );
};
export default ParentComp;