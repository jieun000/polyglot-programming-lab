import * as fsExtra from 'fs-extra';
import { fileExists } from './fileExists';

export const rmdir = (dirname: string): Promise<string> =>
    new Promise(async (resolve, reject) => {
        const alreadyExists = await fileExists(dirname);
        if (alreadyExists) {
            try {
                await fsExtra.remove(dirname); // remove 메서드를 사용하여 디렉토리 삭제
                resolve(dirname);
            } catch (error) {
                reject(error);
            }
        } else {
            resolve(dirname);
        }
    });



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