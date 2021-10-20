import './App.css';
import {Button} from "antd";
import {useState} from "react";

const doSomething = () => {
    console.log("Ein Click!");
}

const App = () => {
    const [theState, setTheState] = useState({"name": "Unknown"});

    return (
        <div className="App">
            <header className="App-header">
                <p>Dies ist ein Test!</p>
                <Button onClick={doSomething}>Click me!</Button>
                <p>The State is: {theState.name}</p>
            </header>
        </div>
    );
}

export default App;
