import {useState} from "react";
import axios from "../Config/api";

const AddPostForm = ({reloadPostsHandler}) => {

    const [form, setForm] = useState({});
    const [error, setError] = useState("")

    const inputHandler = e => {
        setError("");
        setForm({...form, [e.target.name]: e.target.value})
    }

    const checkInputs = formInputs => {

        if ( !form.title || !form.content || !form.author) {
            setError("Fields should not be empty");
            return false;
        }
    }

    const savePost = () => {

        if (!checkInputs(form)) {
            return false;
        }

        axios.post("posts", form)
            .then(res => {
                console.log(res.data);
                setForm({});
                reloadPostsHandler();
            })
            .catch(err => console.log(err))
    }

    return <div className={`col-12`}>
        <div className={`py-5`}>
            <form>
                <div className="form-group mb-2">
                    <label htmlFor={`PostTitle`}>Title</label>
                    <input
                        id={`PostTitle`}
                        onChange={e => inputHandler(e)}
                        value={form?.title && form.title || ''}
                        className="form-control"
                        type="text"
                        name="title"/>
                </div>
                <div className="form-group mb-2">
                    <label htmlFor={`PostContent`}>Content</label>
                    <textarea
                        id={`PostContent`}
                        onChange={e => inputHandler(e)}
                        className="form-control"
                        value={form?.content && form.content || ''}
                        name="content"/>
                </div>
                <div className="form-group mb-2">
                    <label htmlFor={`PostAuthor`}>Author</label>
                    <input
                        id={`PostAuthor`}
                        onChange={e => inputHandler(e)}
                        value={form?.author && form.author || ''}
                        className="form-control"
                        type="text"
                        name="author"/>
                </div>
                {error && <p className={`error-text`}>{error}</p>}
                <button
                    onClick={() => savePost([])}
                    className="btn btn-outline-primary float-end"
                    type="button">Save
                </button>
            </form>
        </div>
    </div>
}

export default AddPostForm;