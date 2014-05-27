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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_17555)
  { 
    TermReference f_17555 = new TermReference(ref_f_17555);
    context.push("get_all_sources_0_1");
    Fail87572:
    { 
      IStrategoTerm term47210 = term;
      Success47210:
      { 
        Fail87573:
        { 
          term = collect_all_1_0.instance.invoke(context, term, lifted24728.instance);
          if(term == null)
            break Fail87573;
          term = get_local_sources_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87573;
          lifted24729 lifted247290 = new lifted24729();
          lifted247290.f_17555 = f_17555;
          term = map_1_0.instance.invoke(context, term, lifted247290);
          if(term == null)
            break Fail87573;
          if(true)
            break Success47210;
        }
        term = debug_1_0.instance.invoke(context, term47210, lifted24730.instance);
        if(term == null)
          break Fail87572;
        if(true)
          break Fail87572;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}