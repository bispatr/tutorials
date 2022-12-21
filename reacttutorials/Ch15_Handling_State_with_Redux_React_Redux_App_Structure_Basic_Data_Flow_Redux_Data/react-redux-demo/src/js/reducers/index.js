import { ADD_ARTICLE } from "../constants/action-types";

const intialState={
    articles:[]
};
function rootReducer(state=intialState,action){
    if(action.type === ADD_ARTICLE){
        
        return Object.assign({},state,{
            articles: state.articles.concat(action.payload)
        });
        
       
    }
    return state;
}
export default rootReducer;