import './App.css';
import ClassComp from './ClassComp';
import FuncComp from './FuncComp';
import PropsDemo from './PropsDemo';
import PropsClassDemo from './PropsClassDemo';
function App() {
  
  return (
    <div>
      working
      <ClassComp />
      <FuncComp />
      <PropsDemo name={'Tim jones'}/>
      <PropsClassDemo name={'Graham Bell'}/>
    </div>
  );
}

export default App;
