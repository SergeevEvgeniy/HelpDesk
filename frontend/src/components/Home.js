import React from 'react';
import { withRouter } from "react-router";

function Home({ history }) {
    const onEdit = () => {
        history.push('/edit')
    }
    return (
        <div>
            <h1>Home</h1>
            <div onClick={onEdit}> Edit </div>
        </div>
    );

}

export default withRouter(Home);