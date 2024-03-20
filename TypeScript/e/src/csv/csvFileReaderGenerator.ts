import { readFileGenerator } from '../fileApi';
import { zip } from '../utils';

export function* csvFileReaderGenerator(filename: string, delim: string = ',') {
    let header: string[] = [];
    for (const line of readFileGenerator(filename)) {
        if (!header.length) {
            header = Object.keys(line);
        } else {
            const values = Object.values(line);
            yield zip(header, values);
        }
    }
}
