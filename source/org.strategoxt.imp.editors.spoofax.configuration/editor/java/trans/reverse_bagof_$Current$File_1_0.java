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

@SuppressWarnings("all") public class reverse_bagof_$Current$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$File_1_0 instance = new reverse_bagof_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4641)
  { 
    context.push("reverse_bagof_CurrentFile_1_0");
    Fail22996:
    { 
      TermReference f_4641 = new TermReference();
      if(f_4641.value == null)
        f_4641.value = term;
      else
        if(f_4641.value != term && !f_4641.value.match(term))
          break Fail22996;
      Success12222:
      { 
        Fail22997:
        { 
          IStrategoTerm j_4641 = null;
          IStrategoTerm l_4641 = null;
          IStrategoTerm m_4641 = null;
          l_4641 = term;
          j_4641 = trans.const4485;
          m_4641 = l_4641;
          term = dr_lookup_rule_0_2.instance.invoke(context, m_4641, j_4641, trans.constCons2047);
          if(term == null)
            break Fail22997;
          if(true)
            break Success12222;
        }
        term = trans.constNil4;
      }
      lifted6900 lifted69000 = new lifted6900();
      lifted69000.f_4641 = f_4641;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted69000, h_4641);
      if(term == null)
        break Fail22996;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}