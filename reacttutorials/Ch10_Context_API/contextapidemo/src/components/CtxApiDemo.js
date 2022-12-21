import React from 'react';
export const UserContext = React.createContext();
const CtxApiDemo = () => {
    return (
        <div>
            <h2>Context Api Demo</h2>
            <UserContext.Provider value="Reed">
      <User />
    </UserContext.Provider>
        </div>
    );
};
function User() {
    return (
      <UserContext.Consumer>
        {value => <h1>{value}</h1>} 
        {/* prints: Reed */}
      </UserContext.Consumer>
    )
  }
export default CtxApiDemo;