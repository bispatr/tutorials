import React from 'react';
const ChildB = ({ chooseMessage }) => {
    let msg = 'Good Night';
    return (
      <div>
        <button onClick={() => chooseMessage(msg)}>Good Night</button>
      </div>
    )
};
export default ChildB;