import React, { useState, useEffect } from 'react';
const HttpCallsFn = () => {
    const [totalReactPackages, setTotalReactPackages] = useState(null);

    useEffect(() => {
        // GET request using fetch inside useEffect React hook
        fetch('https://api.npms.io/v2/search?q=react')
            .then(response => response.json())
            .then(data => setTotalReactPackages(data.total));

    // empty dependency array means this effect will only run once (like componentDidMount in classes)
    }, []);
    return (
        <div>
            <h3>Http Calls Demo Fn Component</h3>
            <h5 className="card-header">GET Request with React Hooks</h5>
            <div className="card-body">
                Total react packages: {totalReactPackages}
            </div>
        </div>
    );
};
export default HttpCallsFn;