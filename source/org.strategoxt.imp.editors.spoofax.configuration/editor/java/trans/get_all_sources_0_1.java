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

@SuppressWarnings("all") public class get_all_sources_0_1 extends Strategy 
{ 
  public static get_all_sources_0_1 instance = new get_all_sources_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_4611)
  { 
    TermReference i_4611 = new TermReference(ref_i_4611);
    context.push("get_all_sources_0_1");
    Fail22764:
    { 
      IStrategoTerm term12123 = term;
      Success12123:
      { 
        Fail22765:
        { 
          term = collect_all_1_0.instance.invoke(context, term, lifted6843.instance);
          if(term == null)
            break Fail22765;
          term = get_local_sources_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22765;
          lifted6844 lifted68440 = new lifted6844();
          lifted68440.i_4611 = i_4611;
          term = map_1_0.instance.invoke(context, term, lifted68440);
          if(term == null)
            break Fail22765;
          if(true)
            break Success12123;
        }
        term = debug_1_0.instance.invoke(context, term12123, lifted6845.instance);
        if(term == null)
          break Fail22764;
        if(true)
          break Fail22764;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}