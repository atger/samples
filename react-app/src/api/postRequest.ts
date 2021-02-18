import axios from "./config";
import { getData } from "../localStorage/getData";

export const postRequest = async (endPoint : any, params? : any) => {
  try {
    const user = await getData("user");
    const token = user && user.username ? user.token : "";
    return await axios.post(endPoint, params, {
      headers: { authorization: "Bearer " + token },
    });
  } catch (e) {
    console.log("error", e);
  }
};
