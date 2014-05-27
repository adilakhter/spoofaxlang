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

@SuppressWarnings("all") public class get_sources_from_external_projects_0_0 extends Strategy 
{ 
  public static get_sources_from_external_projects_0_0 instance = new get_sources_from_external_projects_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_sources_from_external_projects_0_0");
    Fail87577:
    { 
      term = get_all_project_refernces_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87577;
      IStrategoTerm term47221 = term;
      Success47213:
      { 
        Fail87578:
        { 
          IStrategoTerm s_17556 = null;
          s_17556 = term;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail87578;
          term = s_17556;
          { 
            term = get_external_sources_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail87577;
            if(true)
              break Success47213;
          }
        }
        term = term47221;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}