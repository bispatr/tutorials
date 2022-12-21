import React,{Component} from "react";
import { connect } from "react-redux";
import {addArticle} from "../actions/index";

function mapDispatchToProps(dispatch){
    return {
        addArticle:article=>dispatch(addArticle(article))
    };
}
class ConnectedForm extends Component{
    constructor(props){
        super(props);
        this.state={title:''};
    }
    handleSubmit=(event)=>{
        event.preventDefault();
        const {title}=this.state;
        this.props.addArticle({title});
        this.setState({title:''});
    }
    handleChange=(event)=>{
        this.setState({[event.target.id]:event.target.value});
    }
    render(){
        const {title}=this.state;
        return(
            <form onSubmit={this.handleSubmit}>
                <div>
                    <label> Title</label>
                    <input type="text" id="title" value={title} onChange={this.handleChange} />
                </div>
                <button type="submit">Save</button>
                </form>
        )
    }
}
const Form=connect(null,mapDispatchToProps)(ConnectedForm);
export default Form;