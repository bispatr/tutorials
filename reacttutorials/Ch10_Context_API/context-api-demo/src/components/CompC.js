import { useContext } from "react";
import { firstName,lastName } from "../App";
function CompC(){
    const fname=useContext(firstName);
    const lname=useContext(lastName);
    return(
        <div>
            <h1>I am CompC {fname} {lname}</h1>
        </div>
    )
}
export default CompC;