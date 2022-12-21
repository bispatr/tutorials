import { createContext } from "react";
import CompA from "./components/CompA";
import CompC from "./components/CompC";

const firstName=createContext();
const lastName=createContext();
function App() {
  return (
    <div className="App">
      <h1>I am the main component</h1>
      <firstName.Provider value="John">
        <lastName.Provider value="Doe">
      <CompA />
      <CompC />
      </lastName.Provider>
      </firstName.Provider>
    </div>
  );
}

export default App;
export {firstName,lastName};
