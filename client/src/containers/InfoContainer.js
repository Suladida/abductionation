import React from 'react';
import ReactDOM from 'react-dom';


const InfoContainer = (props) => {
    return (
        <>
        HEYYYY {props.species}
        </>
    )
}

ReactDOM.render(
    <InfoContainer/>, document.getElementById('root')
);


export default InfoContainer;