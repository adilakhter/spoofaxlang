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

@SuppressWarnings("all") public class implode_string_0_1 extends Strategy 
{ 
  public static implode_string_0_1 instance = new implode_string_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4765)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("implode_string_0_1");
    Fail23010:
    { 
      IStrategoTerm m_4765 = null;
      m_4765 = term;
      term = k_4765;
      IStrategoTerm term12347 = term;
      Success12272:
      { 
        Fail23011:
        { 
          term = is_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23011;
          if(true)
            break Success12272;
        }
        term = term12347;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4);
        term = implode_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23010;
      }
      term = separate_by_0_1.instance.invoke(context, m_4765, term);
      if(term == null)
        break Fail23010;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23010;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}