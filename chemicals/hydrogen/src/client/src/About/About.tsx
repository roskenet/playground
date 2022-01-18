import { Layout } from "antd";
import NavigationLinks from "../Elements/NavigationLinks";
import {useEffect} from "react";

const { Content } = Layout;

function About() {

  useEffect(() => {
    return () => { console.log('Leaving the About Page!'); }
  }, [ ])

  return (
      <div>
        <Layout>
          <Content style={{margin: '24px 16px 0'}}>
            <h1> Hello World! </h1>
            <p>Dies ist die About Seite!</p>
            <NavigationLinks/>
          </Content>
        </Layout>
      </div>
  );
}

export default About;
