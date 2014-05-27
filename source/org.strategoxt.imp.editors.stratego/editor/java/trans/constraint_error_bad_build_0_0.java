package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class constraint_error_bad_build_0_0 extends Strategy 
{ 
  public static constraint_error_bad_build_0_0 instance = new constraint_error_bad_build_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("constraint_error_bad_build_0_0");
    Fail23309:
    { 
      IStrategoTerm m_4820 = null;
      term = collect_1_0.instance.invoke(context, term, lifted6937.instance);
      if(term == null)
        break Fail23309;
      term = filter_1_0.instance.invoke(context, term, lifted6938.instance);
      if(term == null)
        break Fail23309;
      term = map_1_0.instance.invoke(context, term, lifted6939.instance);
      if(term == null)
        break Fail23309;
      m_4820 = term;
      IStrategoTerm term12645 = term;
      Success12525:
      { 
        Fail23310:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail23310;
          { 
            if(true)
              break Fail23309;
            if(true)
              break Success12525;
          }
        }
        term = term12645;
      }
      term = m_4820;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}