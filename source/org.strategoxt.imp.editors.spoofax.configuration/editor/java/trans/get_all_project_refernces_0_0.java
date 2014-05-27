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

@SuppressWarnings("all") public class get_all_project_refernces_0_0 extends Strategy 
{ 
  public static get_all_project_refernces_0_0 instance = new get_all_project_refernces_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_all_project_refernces_0_0");
    Fail87592:
    { 
      IStrategoTerm term47233 = term;
      Success47225:
      { 
        Fail87593:
        { 
          term = collect_all_2_0.instance.invoke(context, term, lifted24731.instance, conc_0_0.instance);
          if(term == null)
            break Fail87593;
          term = flatten_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87593;
          term = filter_1_0.instance.invoke(context, term, lifted24733.instance);
          if(term == null)
            break Fail87593;
          if(true)
            break Success47225;
        }
        term = debug_1_0.instance.invoke(context, term47233, lifted24734.instance);
        if(term == null)
          break Fail87592;
        if(true)
          break Fail87592;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}