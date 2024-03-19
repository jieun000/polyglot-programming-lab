import { IFake } from "./IFake";
export {IFake};
import Chance from "chance";

const c = new Chance;
export const makeFakeData = (): IFake=> ({
    name: c.name(),
    email: c.email(),
    sentence: c.sentence(),
    profession: c.profession(),
    birthday: c.birthday()
});

