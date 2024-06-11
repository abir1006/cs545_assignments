import Post from "./Components/Post";
import {useState} from "react";

const Dashboard = () => {

    const postsArr = [
        {id: 111, title: "Happiness", author: "John"},
        {id: 112, title: "MIU", author: "Dean"},
        {id: 113, title: "Enjoy life", author: "Jasmine"},
    ]

    const [posts, setPosts] = useState(postsArr);
    const [title, setTitle] = useState('')
    const [postDetailsID, setPostDetailsID] = useState(100);

    const changePost = postID => {
        const index = posts.findIndex(post => post.id === postID);
        posts[index].title = title;
        setPosts(posts);
        setTitle('');
    }

    const postDetails = posts.find(post => post.id === postDetailsID);

    return <div className="container">
        <h2 className={`mt-5 mb-5`}>All posts </h2>
        <div className={`row`}>
            {
                posts.map(post => {
                    return <Post
                        setPostDetailsID={setPostDetailsID}
                        post={post}/>
                })
            }
        </div>
        <div className={`row`}>
            <div className={`col-4`}>
                <div className={`py-3`}>
                    <form>
                        <div className="form-group mb-2">
                            <input
                                onChange={e => setTitle(e.target.value)}
                                value={title}
                                class="form-control"
                                type="text"
                                name="post_title"/>
                        </div>
                        <button
                            onClick={() => changePost(111)}
                            className="btn btn-primary"
                            type="button">Change title
                        </button>
                    </form>
                </div>
            </div>
        </div>
        {postDetails && <div className={`row`}>
            <div className={`col-12`}>
                <h5 className={`py-3 text-end`}>Post details</h5>
                <div className={`post-details`}>
                    <div className={`card p-3 single-post`}>
                        <div>ID: {postDetails.id}</div>
                        <h4>Title: {postDetails.title}</h4>
                        <p>Author: {postDetails.author}</p>
                    </div>
                </div>
            </div>
        </div>}
    </div>
}

export default Dashboard;