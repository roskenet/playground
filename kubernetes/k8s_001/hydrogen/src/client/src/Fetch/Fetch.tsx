import {Button} from "antd";
import {useState} from "react";
import NavigationLinks from "../Elements/NavigationLinks";

const Fetch = () => {
  const [theState, setTheState] = useState({"name": "Unknown"});

  const doSomething = () => {
    console.log("Ein Click!");

    fetch('http://oxygen.192-168-39-53.nip.io/api/name/some%20body')
    .then(response => response.json())
    .then(result => setTheState({"name": result.value}))
    .catch(error => console.error(error));
    // .then(result => console.log(result))
    //     .catch(error => console.error(error));

  }

  return (
      <div>
          <h1>Let's call the Oxygen!</h1>
          <p>Dies is a real Killer App!</p>
          <Button onClick={doSomething}>Click me!</Button>
          <p>The State is: {theState.name}</p>
          <NavigationLinks/>
      </div>
  );
}

export default Fetch;