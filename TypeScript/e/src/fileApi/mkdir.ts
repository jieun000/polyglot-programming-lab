import * as fsExtra from 'fs-extra';
import { fileExists } from './fileExists';


export const mkdir = (dirname: string): Promise<string> =>
    new Promise(async (resolve, reject) => {
        const alreadyExists = await fileExists(dirname);
        if (!alreadyExists) {
            fsExtra.ensureDir(dirname)
                .then(() => resolve(dirname))
                .catch(reject);
        } else {
            resolve(dirname);
        }
    });