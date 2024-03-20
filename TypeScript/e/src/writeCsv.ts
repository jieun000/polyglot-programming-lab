import { writeCsvFormatFakeData } from "./fake";
import { getFileNameAndNumber } from "./utils/getFileNameAndNumber";

const [filename, numberOfFakeData] = getFileNameAndNumber('./data/fake', 1);
const csvFilename = `${filename}-${numberOfFakeData}.csv`;
writeCsvFormatFakeData(csvFilename, numberOfFakeData)
    .then(result=> console.log(result))
    .catch((e: Error)=> console.log(e.message));



// ts-node .\src\writeCsv.ts data/fake 100