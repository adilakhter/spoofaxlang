package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class origin_documentation_comment_0_0 extends Strategy 
{ 
  public static origin_documentation_comment_0_0 instance = new origin_documentation_comment_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("origin_documentation_comment_0_0");
    Fail87690:
    { 
      term = origin_surrounding_comments_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87690;
      term = filter_1_0.instance.invoke(context, term, lifted24751.instance);
      if(term == null)
        break Fail87690;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87690;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}