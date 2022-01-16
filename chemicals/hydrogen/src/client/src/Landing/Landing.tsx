import { Layout } from "antd";
import {Link} from "react-router-dom";

const { Content } = Layout;

function Landing() {

  return (
      <div>
        <Layout>
          <Content style={{margin: '24px 16px 0'}}>
            <h1> Hello World! </h1>
            <p>Dies ist die Landing Page der Anwendung!</p>
            <div>
              <Link to={"/"}>Home</Link> |{" "}
              <Link to={"counter"}>Counter</Link> |{" "}
              <Link to={"fetch"}>Fetch Example</Link> |{" "}
              <Link to={"about"}>About</Link>
            </div>
          </Content>
        </Layout>
      </div>
  );
}

export default Landing;
