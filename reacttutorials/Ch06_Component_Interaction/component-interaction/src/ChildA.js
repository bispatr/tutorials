import React from 'react';
const ChildA = ({ chooseMessage }) => {
    let msg = 'Good Morning';
    return (
      <div>
        <button onClick={() => chooseMessage(msg)}>Good Morning</button>
      </div>
    )
};
export default ChildA;