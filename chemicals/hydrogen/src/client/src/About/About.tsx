import { Layout } from "antd";

const { Content } = Layout;

function About() {

  return (
      <div>
        <Layout>
          <Content style={{margin: '24px 16px 0'}}>
            <h1> Hello World! </h1>
            <p>Dies ist die About Seite!</p>
          </Content>
        </Layout>
      </div>
  );
}

export default About;
