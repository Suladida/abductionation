import logo from './logo.svg';
import React from 'react';
import ReactDOM from 'react-dom';
import './App.css';
import NavBar from './components/NavBar';
import MainContainer from './containers/MainContainer';

function App() {
  return (
    <div className="App">
      < NavBar />
      < MainContainer/>
      
      
    </div>
  );
}

ReactDOM.render(
  <App/>, document.getElementById('root')
);

export default App;
