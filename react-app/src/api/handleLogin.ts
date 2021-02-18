import { postRequest } from "./postRequest";
import { LOGIN } from "./config";
import { storeData } from "../localStorage/storeData";

export const handleLogin = async (values: any) => {
  try {
    const res = await postRequest(LOGIN, values);
    if (res) {
        storeData("user", res.data);
    }
    return res;
  } catch (e) {
    alert('Incorrect Username or Password!');
  }
};
