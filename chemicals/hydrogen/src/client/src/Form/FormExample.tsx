import {Button, Checkbox, Form, Input} from "antd";
import {useState} from "react";

const FormExample = () => {
  const [theState, setTheState] = useState({"name": "Unknown"});

  const doSomething = () => {
    console.log("Ein Click!");

    fetch('http://oxygen.192-168-49-2.nip.io/api/name/some%20body')
    .then(response => response.json())
    .then(result => setTheState({"name": result.value}))
    .catch(error => console.error(error));
    // .then(result => console.log(result))
    //     .catch(error => console.error(error));
  }

  return (
      <div>
        <Form
        name="basic"
        labelCol={{ span: 8 }}
        wrapperCol={{ span: 16 }}
        initialValues={{ remember: true }}
        // onFinish={onFinish}
        // onFinishFailed={onFinishFailed}
        autoComplete="off"
        >
        <Form.Item
            label="Username"
            name="username"
            rules={[{ required: true, message: 'Please input your username!' }]}
        >
          <Input />
        </Form.Item>

        <Form.Item
            label="Password"
            name="password"
            rules={[{ required: true, message: 'Please input your password!' }]}
        >
          <Input.Password />
        </Form.Item>

        <Form.Item name="remember" valuePropName="checked" wrapperCol={{ offset: 8, span: 16 }}>
          <Checkbox>Remember me</Checkbox>
        </Form.Item>

        <Form.Item wrapperCol={{ offset: 8, span: 16 }}>
          <Button type="primary" htmlType="submit">
            Submit
          </Button>
        </Form.Item>
      </Form>
      </div>
  );
}

export default FormExample;