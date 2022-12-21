import React from 'react';
class PropsClassDemo extends React.Component {
    constructor(props) {
        super(props);
        this.state = {};
    }

    render() {
        return (
            <div>
                <p>{this.props.name}</p>
            </div>
        );
    }
}
export default PropsClassDemo;
