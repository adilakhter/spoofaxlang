package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reserve_class_name_0_0 extends Strategy 
{ 
  public static reserve_class_name_0_0 instance = new reserve_class_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("reserve_class_name_0_0");
    Fail25948:
    { 
      TermReference e_4283 = new TermReference();
      IStrategoTerm f_4283 = null;
      IStrategoTerm h_4283 = null;
      IStrategoTerm m_4283 = null;
      IStrategoTerm o_4283 = null;
      IStrategoTerm p_4283 = null;
      term = to_java_class_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25948;
      if(e_4283.value == null)
        e_4283.value = term;
      else
        if(e_4283.value != term && !e_4283.value.match(term))
          break Fail25948;
      lifted9322 lifted93220 = new lifted9322();
      lifted9318 lifted93180 = new lifted9318();
      lifted93220.e_4283 = e_4283;
      lifted93180.e_4283 = e_4283;
      term = for_3_0.instance.invoke(context, term, lifted93180, lifted9319.instance, lifted93220);
      if(term == null)
        break Fail25948;
      term = $Snd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25948;
      f_4283 = term;
      h_4283 = term;
      o_4283 = term;
      m_4283 = generator.const7167;
      p_4283 = o_4283;
      term = termFactory.makeTuple(generator.const7168, f_4283);
      term = dr_set_rule_0_3.instance.invoke(context, p_4283, m_4283, f_4283, term);
      if(term == null)
        break Fail25948;
      term = h_4283;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}