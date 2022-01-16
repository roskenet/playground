import './App.less';
import {Layout} from "antd";
import {Content, Footer, Header} from "antd/es/layout/layout";

function App() {
  return (
    <div>
      <Layout>
        <Header><p>Hello World</p></Header>
        <Content><p>This is the content</p></Content>
        <Footer>This is the Footer</Footer>
      </Layout>
    </div>
  );
}

export default App;
