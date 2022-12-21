import React from 'react';
class HttpCallsCls extends React.Component {
    constructor(props) {
        super(props);
        this.state = {};
    }
    async componentDidMount() {
        const response = await fetch('https://api.npms.io/v2/search?q=react');
        const data = await response.json();
        this.setState({ totalReactPackages: data.total })
    }
    render() {
        const { totalReactPackages } = this.state;        
        return (
            <div className="card text-center m-3">
            <h5 className="card-header">GET Request with Async/Await</h5>
            <div className="card-body">
                Total react packages: {totalReactPackages}
            </div>
        </div>
        );
    }
}
export default HttpCallsCls;
