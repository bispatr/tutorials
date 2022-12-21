import React from 'react';

class ClassComp extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            name:'John Wright'
        };
    }
    handleChange = (e) => {
        this.setState({ name: e.target.value });
      };
    render() {
        return (
            <div>
                <h1>Class Components</h1>
                <input  type="text"
          value={this.state.name}
          onChange={this.handleChange}></input>
          <p>{this.state.name}</p>
            </div>
        );
    }
}

export default ClassComp;
