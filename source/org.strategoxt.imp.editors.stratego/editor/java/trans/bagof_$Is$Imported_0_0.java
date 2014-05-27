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

@SuppressWarnings("all") public class bagof_$Is$Imported_0_0 extends Strategy 
{ 
  public static bagof_$Is$Imported_0_0 instance = new bagof_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsImported_0_0");
    Fail23449:
    { 
      TermReference d_4841 = new TermReference();
      TermReference e_4841 = new TermReference();
      if(e_4841.value == null)
        e_4841.value = term;
      else
        if(e_4841.value != term && !e_4841.value.match(term))
          break Fail23449;
      if(d_4841.value == null)
        d_4841.value = term;
      else
        if(d_4841.value != term && !d_4841.value.match(term))
          break Fail23449;
      Success12593:
      { 
        Fail23450:
        { 
          IStrategoTerm i_4841 = null;
          i_4841 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4841, trans.const4537, e_4841.value);
          if(term == null)
            break Fail23450;
          if(true)
            break Success12593;
        }
        term = trans.constNil4;
      }
      lifted6992 lifted69920 = new lifted6992();
      lifted69920.d_4841 = d_4841;
      lifted69920.e_4841 = e_4841;
      term = filter_1_0.instance.invoke(context, term, lifted69920);
      if(term == null)
        break Fail23449;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}