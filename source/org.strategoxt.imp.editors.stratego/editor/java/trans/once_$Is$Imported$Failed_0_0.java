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

@SuppressWarnings("all") public class once_$Is$Imported$Failed_0_0 extends Strategy 
{ 
  public static once_$Is$Imported$Failed_0_0 instance = new once_$Is$Imported$Failed_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImportedFailed_0_0");
    Fail22202:
    { 
      IStrategoTerm d_4326 = null;
      TermReference e_4326 = new TermReference();
      TermReference f_4326 = new TermReference();
      TermReference g_4326 = new TermReference();
      IStrategoTerm h_4326 = null;
      IStrategoTerm i_4326 = null;
      IStrategoTerm k_4326 = null;
      IStrategoTerm m_4326 = null;
      if(f_4326.value == null)
        f_4326.value = term;
      else
        if(f_4326.value != term && !f_4326.value.match(term))
          break Fail22202;
      if(e_4326.value == null)
        e_4326.value = term;
      else
        if(e_4326.value != term && !e_4326.value.match(term))
          break Fail22202;
      k_4326 = term;
      m_4326 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, m_4326, trans.const4366, f_4326.value);
      if(term == null)
        break Fail22202;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22202;
      d_4326 = term.getSubterm(0);
      i_4326 = term.getSubterm(1);
      h_4326 = term.getSubterm(2);
      term = d_4326;
      lifted6800 lifted68000 = new lifted6800();
      lifted68000.e_4326 = e_4326;
      lifted68000.f_4326 = f_4326;
      lifted68000.g_4326 = g_4326;
      term = split_fetch_1_0.instance.invoke(context, term, lifted68000);
      if(term == null)
        break Fail22202;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22202;
      term = hashtable_put_0_2.instance.invoke(context, h_4326, i_4326, term);
      if(term == null)
        break Fail22202;
      term = k_4326;
      if(g_4326.value == null)
        break Fail22202;
      term = g_4326.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}