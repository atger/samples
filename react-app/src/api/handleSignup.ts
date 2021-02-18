import { postRequest } from "./postRequest";
import { SIGNUP } from "./config";

export const handleSignup = async (values: any) => {
  try {
    const res = await postRequest(SIGNUP, values);
    return res;
  } catch (e) {
    alert('Incorrect Username or Password!');
  }
};
